package de.sambalmueslie.wot_api_definition.clan_ratings_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDate;
import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns list of adjacent positions in specified clan rating.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "clanratings/neighbors/")
public class ClanratingsNeighborsRequestDefinition extends WotRequestDefinition {

	/** Clan ID. */
	@WotApiFieldDefinition(list = true, required = true)
	private long clan_id;

	/**
	 * Ratings calculation date. Up to 7 days before the current date; default value: yesterday. Date in UNIX timestamp or ISO 8601 format.
	 * E.g.: 1376542800 or 2013-08-15T00:00:00.
	 */
	@WotApiFieldDefinition
	@WotApiFieldDate
	private String date;

	/** Maximum number of adjacent positions in clan rating. Maximum: 504 default value: 5. */
	@WotApiFieldDefinition
	private long limit;
	/** Rating category. */
	@WotApiFieldDefinition(required = true)
	private String rank_field;
	/** Rating period. */
	@WotApiFieldDefinition(required = true)
	private String type;
}
